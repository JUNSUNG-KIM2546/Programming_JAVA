package app;

import base.Shape;
import derived.Circle;

class GraphicEditor {
	public static void main(String[] args) {
		Shape shape = new Circle();	//동적바인딩 호출을 부모로 했어도 값은 자식껄로 가져온다. 
		shape.draw();
	}
}
