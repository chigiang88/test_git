package giang.test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;


public class Test {
	public static void main(String[] args) throws Exception{
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSXXX");
		System.out.println(sdf.format(new Date()));
		
		int secondAllowEdit = 3600;
		int durationHour = (int) (secondAllowEdit / (60*60));
		int durationMinute = (int) ((secondAllowEdit - durationHour*60*60) / (60));
		int durationSecond = (int) ((secondAllowEdit - durationHour*60*60 - durationMinute*60));
		
		boolean isValid = true;
		Date timeAllowEditSchedule = new Date();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR, durationHour);
		cal.add(Calendar.MINUTE, durationMinute);
		cal.add(Calendar.SECOND, durationSecond);
		timeAllowEditSchedule = cal.getTime();
		System.out.println(timeAllowEditSchedule);
		
		/*List<Integer> a = Arrays.asList(1,2,3);
		System.err.println(a.toString());
		System.err.println(a.toString().substring(1, a.toString().length()-1));
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);*/
		
		/*Date startDate, endDate;
		Calendar cal = Calendar.getInstance();
		startDate = cal.getTime();
		cal.add(Calendar.HOUR, 1);
		endDate = cal.getTime();

		if (startDate.before(endDate)) {
			System.out.println("startDate nho hon end date");
		}
		
		System.out.println(startDate + ", " + endDate);*/
		
		/*try {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String strStart = "2018-05-28 00:00:00";
		String strEnd = "2018-05-28 23:59:59";
		startDate = sdf.parse(strStart);
		endDate = sdf.parse(strEnd);
		
		System.out.println(startDate + ", " + endDate);
		}catch (Exception ex) {
			ex.printStackTrace();
		}*/
		
//		UUID uuid = UUID.randomUUID();
//        String randomUUIDString = uuid.toString();
//        System.out.println("UUID=" + randomUUIDString + ", length = " + randomUUIDString.length());
		
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss'Z'");
//		String date = "2018-05-18T16:53:00Z";
//		Date d = sdf.parse(date);
//		System.out.println("date: "+ d);
//		System.out.println(calculateEndtime(d, 60000));		
		
		
		
		/*int a = 6;
		System.out.println(a);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}
		
		List<Long> arrs = new ArrayList<>();
		arrs.add(1L);
		arrs.add(2L);
		arrs.add(3L);
		arrs.add(4L);
		arrs.add(5L);
		arrs.add(6L);
		System.out.println(arrs.toString());
		for (Long long1 : arrs) {
			if (long1 == 5L)
				arrs.remove(long1);
		}
		
		System.out.println(arrs.toString());
		
		if (args != null && args.length > 0) {
			for (String string : args) {
				System.out.println(string);
			}
		} else {
			System.err.println("You must input parametter.");
		}*/
		
		/*String queryIds = "1*,*2*,*4";
		String[] idStr = queryIds.split("\\*,\\*");
		System.err.println(idStr.length);
		for (String string : idStr) {
			System.err.println(string);
		}

		
		long n = 24721;
		Double d = new Double(n);
		System.out.println((double) Math.round(d/1000*10)/10 );
		
		BigDecimal minExp = new BigDecimal(4);
		BigDecimal maxExp = new BigDecimal(6);
		BigDecimal min = new BigDecimal(6);
		BigDecimal max = new BigDecimal(7);
		
		System.out.println(calculateColor(minExp, maxExp, min, max));*/
		
//		StringBuffer sb = new StringBuffer();
//		String watsonid = "D5001";
//		String requestId = "695001";
//		for (int i = 0; i < 101; i++) {
//			sb = new StringBuffer();
//			sb.append("{");
//			sb.append("\"hmac\": \"viGoOJ67HC6Btry4qXLVZcqnR8UCqJggD55PohusaBN=\",");
//			sb.append("\"meta\": {");
//			sb.append("\"requestID\": \""+requestId + "_" + i +"\",");
//			sb.append("\"requestTimestamp\": \"1494204919234\",");
//			sb.append("\"watsonID\": \"" + watsonid + "\",");
//			sb.append("\"softwareVersion\": \"1.1\",");
//			sb.append("\"osVersion\": \"RTEMS_123\",");
//			sb.append("\"cartridgeID\": \"WATSON_141\",");
//			sb.append("\"cartridgeType\": \"31\",");
//			sb.append("\"cartridgeTotalShotCount\": 221,");
//			sb.append("\"userID\": \"admin\"");
//			sb.append("},");
//			sb.append("\"data\": {");
//			sb.append("\"systemEvents\": [");
//			sb.append("  {\"type\": \"powerOff\",\"timestamp\": \"1494203809234\"},");
//			sb.append("  {\"type\": \"powerOn\",\"timestamp\": \"1494203810454\"},");
//			sb.append("  {\"type\": \"loginFail\",\"timestamp\": \"1494203815454\",\"user\": \"admin\"},");
//			sb.append("  {\"type\": \"login\",\"timestamp\": \"1494203825454\",\"user\": \"admin\"},");
//			sb.append("  {\"type\": \"getter\",\"timestamp\": \"1494203835454\",\"durationMsec\": \"30865\"},");
//			sb.append("  {\"type\": \"softwareUpdate\",\"timestamp\": \"1494203900454\",\"version\": \"1.1\"},");
//			sb.append("  {\"type\": \"cartridgeReplacement\",\"timestamp\": \"1494204010454\",\"cartridgeID\": \"WATSON_141\"},");
//			sb.append("  {\"type\": \"selfTest\",\"timestamp\": \"1494204093554\",\"durationMsec\": \"30865\"},");
//			sb.append("  {\"type\": \"error\",\"timestamp\": \"1494204138654\",\"code\": \"E199\",\"description\": \"Unknown error\"},");
//			sb.append("  {\"type\": \"logout\",\"timestamp\": \"1494204225454\",\"user\": \"admin\"}");
//			sb.append("]");
//			sb.append("}");
//			sb.append("}");
//			
//			System.out.println(sb.toString());
//		}
		
//		ingestData();
		
		
			  
			  
		
		
//		convertSetToList();
//		removeDuplicateElement();
		
//		String a = "AAA\\";
//		System.out.println(a.contains("\\"));
//		a = a.replace("\\", "\\\\");
//		System.out.println(a);
//		
//		String str1 = "132";
//		String str2 = "dasdsa";
//		
//		boolean a1 = str1 != null;
//		boolean a2 = str2 != null;
//		
//		if( (a1 && a2) || (!a1 )){
//			System.out.println("ok");
//		}
//		
//		Map<String, Employee> map = Employee.getMapEmployee();
//		Employee e1 = map.get("1");
//		System.out.println(e1.toString());
		
//		Iterator ite = map.entrySet().iterator();
//		while (ite.hasNext()) {
//			Map.Entry entry =
//		}
		
		
	}
	
	public static Date calculateEndtime(Date startTime, int duration) {
		int durationHour = (int) (duration / (1000*60*60));
		int durationMinute = (int) ((duration - durationHour*1000*60*60) / (1000*60));
		int durationSecond = (int) ((duration - durationHour*1000*60*60 - durationMinute*1000*60)/ 1000);
		
		System.out.println(duration + "ms = " + durationHour + "hours" + durationMinute + "minutes" + durationSecond + "seconds" );
		Date endDate = new Date();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(startTime);
		
		int hours = cal.get(Calendar.HOUR_OF_DAY);
		int minutes = cal.get(Calendar.MINUTE);
		int seconds = cal.get(Calendar.SECOND);
		
		cal.set(Calendar.HOUR_OF_DAY, hours + durationHour);
		cal.set(Calendar.MINUTE, minutes + durationMinute);
		cal.set(Calendar.SECOND, seconds + durationSecond);
		
		return cal.getTime();
	}
	
	private static String calculateColor(BigDecimal minAcceptable, BigDecimal maxAcceptable, BigDecimal minActual, BigDecimal maxActual) {
		if (minActual.compareTo(minAcceptable) >= 0
			&& maxActual.compareTo(maxAcceptable) <= 0 ) {
			return "green";
		} else if (minActual.compareTo(maxAcceptable) > 0
				|| maxActual.compareTo(minAcceptable) < 0 ) {
			return "red";
		} else {
			return "yellow";
		}
	}
	
	public static void ingestData() {
		
	}
	
	public static void convertSetToList() {
		Set<String> set1 = new HashSet<>();
		set1.add("1");
		set1.add("1");
		set1.add("1");
		set1.add("2");
		set1.add("2");
		
		List<String> list1 = new ArrayList<>(set1) ;
		System.out.println(list1.toString());
	}
	
	public static void removeDuplicateElement() {
		List<String> l1 = new ArrayList<>();
		l1.add("1");
		l1.add("1");
		l1.add("1");
		l1.add("2");
		l1.add("2");
		
		Set<String> set1 = new HashSet<>();
		set1.addAll(l1);
		
		l1.clear();
		l1.addAll(set1);
		
		System.out.println(l1.toString());
	}
	
	public static void orderList() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Employee> list = new ArrayList<>();
		Employee e1 = new Employee("Ngo", "Chi Giang" , 30, "0978431677", "giangnc1@fsoft.com.vn", sdf.parse("15/08/1988"));
		list.add(e1);
		Employee e2 = new Employee("Ngo", "Thi Mai" , 45, "0978431677", "mai@fsoft.com.vn", sdf.parse("15/08/1988"));
		list.add(e2);
		Employee e3 = new Employee("Nguyen", "Quang Minh" , 37, "0978431677", "minh@fsoft.com.vn", sdf.parse("15/08/1988"));
		list.add(e3);
		Employee e4 = new Employee("Nguyen", "Tuan Minh" , 3, "0978431677", "minhnguyen@fsoft.com.vn", sdf.parse("15/08/1988"));
		list.add(e4);
		Employee e5 = new Employee("Ngo", "Chi Tung" , 17, "0978431677", "tung@fsoft.com.vn", sdf.parse("15/08/1988"));
		list.add(e5);
		Employee e6 = new Employee("Nguyen", "Thanh Cong" , 30, "0978431677", "cong@fsoft.com.vn", sdf.parse("15/08/1988"));
		list.add(e6);
		Employee e7 = new Employee("Ngo", "Minh Duc" , 15, "0978431677", "duc@fsoft.com.vn", sdf.parse("15/08/1988"));
		list.add(e7);
		Employee e8 = new Employee("Le", "Xuan Hai" , 30, "0978431677", "hai@fsoft.com.vn", sdf.parse("15/08/1988"));
		list.add(e8);
		Employee e9 = new Employee("Ngo", "Cong Hai" , 30, "0978431677", "hainc@fsoft.com.vn", sdf.parse("15/08/1988"));
		list.add(e9);
		Employee e10 = new Employee("Nguyen", "Viet Tung" , 30, "0978431677", "tungnv@fsoft.com.vn", sdf.parse("15/08/1988"));
		list.add(e10);
		
//		for (int i = 0; i < 100; i++) {
//			e1 = new Employee("Ngo", "Giang" + i, i, "0978431677", "giangnc1@fsoft.com.vn", sdf.parse("15/08/1988"));
//			list.add(e1);
//		}
		
		Collections.sort(list, Employee.EmailComparator);
		
		for (Employee employee : list) {
			System.out.println(employee.toString());
		}
	}
	
	public static void callJob() throws Exception {
		JobKey jobKeyA = new JobKey("jobA", "group1");
    	JobDetail jobA = JobBuilder.newJob(JobA.class).withIdentity(jobKeyA).build();

    	JobKey jobKeyB = new JobKey("jobB", "group1");
    	JobDetail jobB = JobBuilder.newJob(JobB.class).withIdentity(jobKeyB).build();

    	JobKey jobKeyC = new JobKey("jobC", "group1");
    	JobDetail jobC = JobBuilder.newJob(JobC.class).withIdentity(jobKeyC).build();


    	Trigger trigger1 = TriggerBuilder.newTrigger().withIdentity("dummyTriggerName1", "group1").withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?")).build();

    	Trigger trigger2 = TriggerBuilder
		.newTrigger()
		.withIdentity("dummyTriggerName2", "group1")
		.withSchedule(
			CronScheduleBuilder.cronSchedule("0/5 * * * * ?"))
		.build();

    	Trigger trigger3 = TriggerBuilder
		.newTrigger()
		.withIdentity("dummyTriggerName3", "group1")
		.withSchedule(
			CronScheduleBuilder.cronSchedule("0/5 * * * * ?"))
		.build();

    	Scheduler scheduler = new StdSchedulerFactory().getScheduler();

    	scheduler.start();
    	scheduler.scheduleJob(jobA, trigger1);
    	scheduler.scheduleJob(jobB, trigger2);
    	scheduler.scheduleJob(jobC, trigger3);

	}
	
	public static String nextId(String id) {
	    String[] parts = id.split("(?=\\d+$)", 2);
	    final int L = parts[1].length();
//	    final int num = Integer.parseInt(parts[1]) + 1;
	    return parts[0] + String.format("%0"+L+"d", L);
	}
	
}
