package com.akashgrade.Troy.models;

import java.util.List;
import java.util.Map;

public class Rule implements Cloneable {
	private static final String LOGICAL_OPERATION = "logical_operation";
	private static final String CONDITIONAL_OPERATION = "conditional_operation";
	private static final String OPERAND_ONE = "operand_one";
	private static final String OPERAND_TWO = "operand_two";
	
	private List<Map<String, String>> data;

	public List<Map<String, String>> getData() {
		return data;
	}

	public void setData(List<Map<String, String>> data) {
		this.data = data;
	}

	public static String getLogicalOperation() {
		return LOGICAL_OPERATION;
	}

	public static String getConditionalOperation() {
		return CONDITIONAL_OPERATION;
	}

	public static String getOperandOne() {
		return OPERAND_ONE;
	}

	public static String getOperandTwo() {
		return OPERAND_TWO;
	}

	@Override
	public String toString() {
		return "Rule [data=" + data + "]";
	}
	
}
