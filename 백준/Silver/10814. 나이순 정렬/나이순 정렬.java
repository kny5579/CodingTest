import java.util.*;

public class Main {
    static class Member {
        int age;
        String name;
        int order;

        public Member(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Member[] members = new Member[n];
        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            members[i]=new Member(age, name, i);
        }

        Arrays.sort(members, (a, b) -> {
            if (a.age != b.age) return a.age - b.age;
            return a.order - b.order;
        });

        for (Member m : members) {
            System.out.println(m.age + " " + m.name);
        }
    }
}
