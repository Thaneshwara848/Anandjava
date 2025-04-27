package comF;

public class Demo1 {
	public static void main(String[] args) {
		String name="  thANeSh  ";
		String name1="Thanesh is a trainer ";
		System.out.println(name);
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.startsWith("t"));
		System.out.println(name.endsWith("t"));
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.length());
		System.out.println(name.trim().length()); // it will remove the space
		System.out.println(name1.charAt(3)); // 0 - T , 3 - n
		System.out.println(name.isEmpty());
		System.out.println(name1.concat("Kuamr"));
		System.out.println(name1.replace("T", "M"));
		System.out.println("=========");
		String[] words=name1.split(" ");
		for(String x: words) {
			System.out.println(x);
		}
	}
}
