package spring.learn.spring.learn.my;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cognizant.SpringLearn.SpringLearnApplication;

public class Country {
		private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
		public String code;
		public String name;
		public Country() {
			LOGGER.debug("Inside Country Constructor");
		}
		public String getCode() {
			LOGGER.debug("Inside getCode");
			return code;
		}
		public void setCode(String code) {
			LOGGER.debug("Inside setCode");
			this.code = code;
		}
		public String getName() {
			LOGGER.debug("Inside getName");
			return name;
		}
		public void setName(String name) {
			LOGGER.debug("Inside setName");
			this.name = name;
		}
		@Override
		public String toString() {
			return "Country (code=" + code + ", name=" + name + ")";
		}
		
		
}
