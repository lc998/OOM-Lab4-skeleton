package se.ju.csi.oom.lab4;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

public class TimeZoneTranslatorTest {

	@Before public void setUp() throws Exception {
	}

	@Test public void testShiftTimeZone() {
		
/*		
		DateTime LectureStart = new DateTime(2018, 8, 27, 8, 0, 0);
		DateTime LectureEnd = new DateTime(2018, 8, 27, 9, 45, 0);
		Person johannes = new Person("Johannes Schmidt");
		Person ragnar = new Person("Ragnar Nohre");
		Place HC218 = new Place("Hc218",57.7785672,14.1614833,20.0);
		
		Event firstOomLecture = new Event("OOM 2018 Lecture 1",
				LectureStart,
				LectureEnd,
				new HashSet<>(Arrays.asList(johannes, ragnar)),
				HC218);
*/
		
		//varje månad är 31 dagar i detta program.
		
		int year = 2018, month = 2, day = 20, hour = 5, minute = 10, second = 20;
		DateTime dt = new DateTime(year, month, day, hour, minute, second);

		//		%04d-%02d-%02d %02d:%02d:%02d
		String date = "2018-02-31 05:10:59";

		assertEquals(date, dt.toString());

		//		dt.shi

		/* Start test */

		dt = TimeZoneTranslator.shiftTimeZone(dt, 0, 1);

		//fix + år, månad dag, timme, min, sek
		
		
		
	}

	@Test public void testShiftEventTimeZone() {
		String startDate = "2018-02-05 05:10:20";
		String endDate = "2018-02-20 05:10:20";

		int year = 2018, month = 2, day = 5, hour = 5, minute = 10, second = 20;
		DateTime dt = new DateTime(year, month, day, hour, minute, second);

		int endyear = 2018, endmonth = 2, endday = 20, endhour = 5, endminute = 10, endsecond = 20;
		DateTime dtSlut = new DateTime(endyear, endmonth, endday, endhour, endminute, endsecond);

		Event ev = new Event(null, dt, dtSlut, null, null);

		assertEquals(startDate, ev.getStartDate().toString());
		assertEquals(endDate, ev.getEndDate().toString());

		String newSDate = "2018-02-10 06:12:05";
		DateTime dtStartNew = new DateTime(newSDate);
		ev.setEndDate(dtStartNew);
		assertEquals(newSDate, ev.getStartDate().toString());

		//		TimeZoneTranslator

		//fail("Not yet implemented");
	}

}
