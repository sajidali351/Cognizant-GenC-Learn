package com.utility;
import com.ui.*;
import java.util.*;


public class Bazaar {
	
	private Map<Integer,String> policyMap;
	
	public Map<Integer, String> getPolicyMap() {
		return policyMap;
	}

	public void setPolicyMap(Map<Integer, String> policyMap) {
		this.policyMap = policyMap;
	}

	//This method should add the policyID as key and policyName as value into the policyMap
	public void addPolicyDetails(int policyId,String policyName)
	{
	    policyMap.put(policyId, policyName);
		
	}
	
	/*
	 * This method should search the policy name based on the policy type and add those policy names
	 * into the list and return the list.
	 * For example: If the map contains the key and value as:
	 *  10654 Max Bupa Health Insurance
	    10321 SBI Health Insurance
	    20145 IFFCO Tokio Two Wheeler Insurance
	    20165 New India Assurance Two Wheeler Insurance
	    10110 Reliance Health Insurance
		if the policy type is Health the output should be
		10110
		10321
		10654

	 */
	public List<Integer> searchBasedOnPolicyType(String policyType){
	    List<Integer> policies = new ArrayList<>();
	    for(int policyId : policyMap.keySet()){
	        
	        if(policyMap.get(policyId).contains(policyType)){
	            policies.add(policyId);
	        }
	    }
		
		return policies;
		
	}
	

}
