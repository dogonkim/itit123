package com.sweettracker.controller;

import java.util.HashMap;

public class UserControl {
	
	HashMap<String, UserInfo> userInfoMap;
	
	public UserControl() {
		userInfoMap = new HashMap<String, UserInfo>();
	}
	
	public int getUserState(String userKey) {

		UserInfo tempUserInfo;
		if(userInfoMap.containsKey(userKey)) {
			tempUserInfo = userInfoMap.get(userKey);
		}else {
			tempUserInfo = new UserInfo();
			userInfoMap.put(userKey, tempUserInfo);
		}				
		tempUserInfo.requiredCount++;
		return tempUserInfo.getUserState();
	}
	
	public int getRequireCount(String userKey) {
		return userInfoMap.get(userKey).getRequiredCount();
	}
	
	public void setUserState(String userKey, int newState) {
		userInfoMap.get(userKey).setUserState(newState);		
	}		
	
	private class UserInfo{
		private int userState; //0 인증 전, 1 인증 후 초기부분
		private int requiredCount;
		
		public UserInfo() {
			userState = 0;
			requiredCount = 0;
		}

		public int getUserState() {
			return userState;
		}

		public void setUserState(int userState) {
			this.userState = userState;
		}

		public int getRequiredCount() {
			return requiredCount;
		}

		public void setRequiredCount(int requiredCount) {
			this.requiredCount = requiredCount;
		}
	}
}
