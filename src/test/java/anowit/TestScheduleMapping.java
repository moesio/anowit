package anowit;

import java.util.List;

import org.junit.Test;

import com.anowit.domain.Schedule;
import com.seimos.commons.web.formbuilder.FormField;
import com.seimos.commons.web.formbuilder.Page;

/**
 * @author moesio
 * @date 2018-01-11 20:02:35
 *
 */
public class TestScheduleMapping {

	@Test
	public void test() {
		Page page = new Page(Schedule.class);
		List<FormField> formFields = page.getFormFields();
		for (FormField formField : formFields) {
			System.out.println(formField.getLabel());
		}
		//		String label = new FormField(Schedule.class, "mainHall.bibleReading.material").getLabel();
		//		assertEquals("schedule.page.field.mainHall.bibleReading.material", label);
	}

}
