package day0326.modifiler;

public class SharpPencil extends Pen{//샤프펜슬
	private int width;//펜의 굵기
	
	public SharpPencil() {}

	public SharpPencil(int width, int amount) {
		super(amount);
		this.width = width;
	}

}
