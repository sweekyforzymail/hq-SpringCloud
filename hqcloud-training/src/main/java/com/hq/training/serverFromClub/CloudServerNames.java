package com.hq.training.serverFromClub;

public enum CloudServerNames {

	// 各服务提供者url名称(可追加)
	CLUB_URL("http://HQCLOUD-CLUB");

	private final String serverUrl;

	private CloudServerNames(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public String getServerUrl() {
		return serverUrl;
	}
}
