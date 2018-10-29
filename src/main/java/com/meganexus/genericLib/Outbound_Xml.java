package com.meganexus.genericLib;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import org.junit.Test;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class Outbound_Xml {

	public static void fetchOutboundXml(String middlePartOfIndex) {
		URL util_url = Test.class.getClassLoader().getResource("pscp.exe");
		File file = new File(util_url.getPath());
		String path = file.getAbsolutePath();
		String parent = null;
		String xmlName = getLatestXMLNameFromInboundServer(middlePartOfIndex);
		System.out.println(xmlName);
		// System.out.println(middlePartOfIndex);
		// System.out.println("Time "+readServerDateAndTime());
		// System.out.println("Time added one
		// minute"+readServTimeByAddOneMin());
		try {
			parent = System.getProperty("user.dir").replace("\\", "/") + "/src/main/resources/outboundXML";
			// System.out.println(parent);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String command = "cmd.exe /c start" + " " + path + " " + "-pw" + " " + "MegaNexus2016" + " " + "mnuser" + "@"
				+ "192.168.2.27"
				+ ":/opt/softwares/apache-servicemix-6.0.0/data/spg-audit/dist-stubs/logCRCStubOutbound/" + xmlName
				+ " " + parent;

		// System.out.println(command);
		try {
			Process copy_file = Runtime.getRuntime().exec(command);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String readServerDateAndTime() {

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH-mm");
		Date today = Calendar.getInstance().getTime();
		String currentXMLDate = df.format(today);
		// System.out.println(currentXMLDate);
		return currentXMLDate;
		/*
		 * TimeZone london = TimeZone.getTimeZone("Europe/London"); long time=
		 * //yourTime return currentXMLDate + london.getOffset(time);
		 */

		/*
		 * Calendar currentdate = Calendar.getInstance(); DateFormat formatter =
		 * new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss"); TimeZone obj =
		 * TimeZone.getTimeZone("Europe/London"); formatter.setTimeZone(obj);
		 * System.out.println("Local:: " + currentdate.getTime());
		 * System.out.println("UK TIME:: " +
		 * formatter.format(currentdate.getTime())); return
		 * formatter.format(currentdate.getTime());
		 */
	}

	/*
	 * public static String readServerDateAndTimeAddOneMin() { DateFormat df =
	 * new SimpleDateFormat("yyyy-MM-dd_HH-mm"); Calendar calendar =
	 * Calendar.getInstance(); long t = calendar.getTimeInMillis(); Date today =
	 * new Date(t + (1 * 60000)); String currentXMLDate = df.format(today); //
	 * System.out.println(currentXMLDate); return currentXMLDate; }
	 */
	// multiple xml file is available on server so you need latest xml
	// @SuppressWarnings("unused")
	// @SuppressWarnings("rawtypes")
	public static String getLatestXMLNameFromInboundServer(String middlePartOfIndex) {
		String SFTPHOST = "192.168.2.27";
		int SFTPPORT = 22;
		String SFTPUSER = "mnuser";
		String SFTPPASS = "MegaNexus2016";
		String SFTPWORKINGDIR = "/opt/softwares/apache-servicemix-6.0.0/data/spg-audit/dist-stubs/logCRCStubOutbound/";
		Session session = null;
		Channel channel = null;
		ChannelSftp channelSftp = null;
		String fileName = null;
		String actualFileName = "Initial Blank";

		try {
			JSch jsch = new JSch();
			session = jsch.getSession(SFTPUSER, SFTPHOST, SFTPPORT);
			session.setPassword(SFTPPASS);
			java.util.Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			session.setConfig(config);
			session.connect();
			channel = session.openChannel("sftp");
			channel.connect();
			channelSftp = (ChannelSftp) channel;
			channelSftp.cd(SFTPWORKINGDIR);

			System.out.println(middlePartOfIndex);
			// System.out.println(readServerDateAndTime());
			// System.out.println(readServTimeByAddOneMin());
			Vector filelist = channelSftp.ls(SFTPWORKINGDIR);
			for (int i = 0; i < filelist.size(); i++) {
				LsEntry entry = (LsEntry) filelist.get(i);
				fileName = entry.getFilename().toString();
				// System.out.println(fileName);
				if (fileName.startsWith(readServerDateAndTime()) && fileName.indexOf(middlePartOfIndex) > 0) {
					actualFileName = fileName;
					System.out.println("Exact matching time");
					return actualFileName;

				} else if (fileName.startsWith(readServTimeByAddOneMin()) && fileName.indexOf(middlePartOfIndex) > 0) {
					System.out.println("time is added by one sec");
					actualFileName = fileName;
					return actualFileName;

				} else {
					// System.out.println("Outbound is not working or time does
					// not match with xml generated in server");

				}
				
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			channel.disconnect();
			session.disconnect();
		}
		return actualFileName;
	}

	// to get xml name from outbound folder
	public static String readXMLFile(String indexName) {
		String nameOfXML = null;
		URL url = Test.class.getResource("/outboundXML");
		try {
			File folder = new File(url.getPath()); //
			// System.out.println(folder);
			File[] listOfFiles = folder.listFiles();
			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].getName().indexOf(indexName) > 0) { //
					// System.out.println(listOfFiles[i].getName());
					nameOfXML = listOfFiles[i].getName();
				}
			}
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return nameOfXML;

	}

	// after successfully xml is generated and saved into your outbound folder
	// then change the xml name to as per your requirement
	public static void changeXMLName(String crcName, String changeXMLName) {
		if (crcName.equals("-C20-to-N00-")) {
			try {
				File file = new File("src/main/resources/outboundXML/" + readXMLFile(crcName));
				System.out.println("file name: " + readXMLFile(crcName));
				File renameFile = new File("src/main/resources/outboundXML/" + changeXMLName);
				if (renameFile.exists()) {
					renameFile.delete();
					System.out.println(file.getName() + " file deleted");
				}
				if (file.renameTo(renameFile)) {
					System.out.println("successfully renamed");
				} else {
					System.out.println("unsuccessful");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println(
					"Outbound is not working or check your organization name or xml file is not generated on your outbond folder");
		}

	}

	// if xml is not generated on exact server time added one minute in current
	// server time

	public static String readServTimeByAddOneMin() {
		String dd = readServerDateAndTime();
		Integer mm = Integer.parseInt(dd.substring(dd.lastIndexOf("-") + 1));
		mm = mm + 1;
		// System.out.println(mm);
		return dd = dd.substring(0, dd.lastIndexOf("-") + 1) + mm;
	}

	/*
	 * public static void main(String[] args) {
	 * System.out.println(getLatestXMLNameFromInboundServer("-C20-to-N00-"));
	 * fetchOutboundXml("-C20-to-N00-"); try { Thread.sleep(1000); } catch
	 * (InterruptedException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } changeXMLName("-C20-to-N00-", "UpdAlias.xml");
	 * 
	 * }
	 */

}
