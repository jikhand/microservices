package com.jit.oo1.actuator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "stage")
public class StageEndpoint {

	Map<String, Stage> stages = new ConcurrentHashMap<>();

	@ReadOperation
	public Map<String, Stage> getAllStages() {
		return stages;
	}

	@ReadOperation
	public Stage getStages(@Selector String name) {
		return stages.get(name);
	}

	@WriteOperation
	public void setValue(@Selector String name, Stage stage) {
		stages.put(name, stage);
	}


	static class Stage {
		int val;

		public int getVal() {
			return val;
		}

		public void setVal(int val) {
			this.val = val;
		}

	}

}
