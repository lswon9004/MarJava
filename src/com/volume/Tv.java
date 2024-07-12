package com.volume;

public class Tv implements Volume {

	private int volumeLevel;

	public Tv() {
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

		System.out.printf("Tv볼륨 올립니다. %d\n", getVolumeLevel());

	}

	@Override
	public void volumeDown(int level) {
		volumeLevel -= level;
		if (volumeLevel < 0) {
			volumeLevel = 0;
		}
		System.out.printf("Tv볼륨 내립니다. %d\n", getVolumeLevel());

	}

}
