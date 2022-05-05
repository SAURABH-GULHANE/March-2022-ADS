/*Q3:Java program to implement two stacks in a single array.*/
class TwoStacks{
	int size;
	int top1,top2;
	int arr[];
	
	TwoStacks(int n){
		arr = new int[n];
		size = n;
		top1 = n/2+1;
		top2 = n/2;
	}
	void push2(int a){
		if(top2 < size-1){
			top2++;
			arr[top2] = a;
		}else{
			System.out.println("Stack overflow");
			return;
		}
	}
	void push1(int x){
		if(top1 > 0){
			top1--;
			arr[top1]=x;
		}else{
			System.out.println("Stack overflow");
			return;
		}
	}
	int pop1(){
		if(top1<=size/2){
			int x =arr[top1];
			top1++;
			return x;
		}else{
			System.out.println("Stack underflow");
			System.exit(1);
		}
		return 0;
	}
	int pop2(){
		if(top2 >=  size/2+1){
			int x =arr[top2];
			top2--;
			return x;
		}else{
			System.out.println("Stack underflow");
			System.exit(1);
		}
		return 1;
	}
	public static void main(String [] args){
		TwoStacks ts = new TwoStacks(5);
		ts.push1(5);
		ts.push2(10);
		ts.push2(40);
		ts.push1(11);
		ts.push2(7);
		System.out.println("Popped elemnts from stack1 is:"+ts.pop1()+"\n");
		ts.push2(15);
		System.out.println("Popped elemnts from stack2 is:"+ts.pop2()+"\n");
	}
}