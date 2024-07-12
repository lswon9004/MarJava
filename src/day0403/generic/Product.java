package day0403.generic;

public class Product<K,M> {
	private K kind;
	private M Model;
	
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return Model;
	}
	public void setModel(M model) {
		Model = model;
	}
}
