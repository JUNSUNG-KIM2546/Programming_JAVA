package chap07;

public class GStack<T> {

	int tos;
	Object [] stck;
	
	public GStack() {
		tos = 0;
		stck = new Object[10];
	}
	
	public void push(T item) {
		if(tos == 10)	//스택이 꽉차서 더 이상 요소를 삽입할 수 없음
			return;
		stck[tos++] = item;
		//tos++;
	}
	
	public T pop() {
		if(tos == 0)	//스택이 비어 있어 꺼낼 요소가 없음
			return null;
		//tos--;
		return (T)stck[--tos];
	}

}
