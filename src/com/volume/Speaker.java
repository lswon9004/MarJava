package com.volume;

public class Speaker implements Volume {

	private int volumeLevel;

	public Speaker() {
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
		if (volumeLevel > 100) {
			volumeLevel = 100;
		}
		System.out.printf("Speak볼륨 올립니다. %d\n", getVolumeLevel());

	}

	@Override
	public void volumeDown(int level) {
		volumeLevel -= level;
		if (volumeLevel < 0) {
			volumeLevel = 0;
		}
		System.out.printf("speak볼륨 내립니다. %d\n", getVolumeLevel());

	}

}
