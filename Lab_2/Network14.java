import java.util.ArrayList;

public class Network14 {
    public class Member { // Класс Member является внутренним // для класса Network
        private String name;
        private ArrayList<Member> friends;

        public Member(String name) {
            this.name = name;
            friends = new ArrayList();
        }
        public Member enroll(String name) {
            Member newMember = new Member(name);
            members.add(newMember);
            return newMember;
        }
        public void leave() {
            members.remove(this) ;
        }
        public boolean belongsTo(Network14 n) {
            return Network14.this == n;
        }
    }

    Member enroll(String name){
        Member newMember = new Member (name);
        return newMember;
    }

    private ArrayList<Member> members;
}