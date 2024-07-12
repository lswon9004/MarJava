package com.volume;

public class Radio implements Volume {
	private int volumeLevel;

	public Radio() {
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}

	@Override
	public void volumeUp(int level) {
		volumeLevel += level;

		System.out.printf("Radio볼륨 올립니다. %d\n", getVolumeLevel());
	}

	@Override
	public void volumeDown(int level) {
		volumeLevel -= level;

		System.out.printf("Radio볼륨 내립니다. %d\n", getVolumeLevel());

	}
}
