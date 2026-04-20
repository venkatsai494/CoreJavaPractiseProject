package solution.leetcode;
import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        UniqueEmailAddresses uniqueEmailAddresses = new UniqueEmailAddresses();
        System.out.println(uniqueEmailAddresses.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));//2
        System.out.println(uniqueEmailAddresses.numUniqueEmails(new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"}));//3
        System.out.println(uniqueEmailAddresses.numUniqueEmails(new String[]{"fg.r.u.uzj+o.pw@kziczvh.com","r.cyo.g+d.h+b.ja@tgsg.z.com","fg.r.u.uzj+o.f.d@kziczvh.com","r.cyo.g+ng.r.iq@tgsg.z.com","fg.r.u.uzj+lp.k@kziczvh.com","r.cyo.g+n.h.e+n.g@tgsg.z.com","fg.r.u.uzj+k+p.j@kziczvh.com","fg.r.u.uzj+w.y+b@kziczvh.com","r.cyo.g+x+d.c+f.t@tgsg.z.com","r.cyo.g+x+t.y.l.i@tgsg.z.com","r.cyo.g+brxxi@tgsg.z.com","r.cyo.g+z+dr.k.u@tgsg.z.com","r.cyo.g+d+l.c.n+g@tgsg.z.com","fg.r.u.uzj+vq.o@kziczvh.com","fg.r.u.uzj+uzq@kziczvh.com","fg.r.u.uzj+mvz@kziczvh.com","fg.r.u.uzj+taj@kziczvh.com","fg.r.u.uzj+fek@kziczvh.com"}));//2
    }
    public int numUniqueEmails(String[] emails) {
        Set<String> setOfEmails = new HashSet<>();
        for (String email : emails) {
            setOfEmails.add(makeStringResultant(email));
        }
        return setOfEmails.size();
    }
    public String makeStringResultant(String str){
        String[] strArray = str.split("@");
        String str1 = strArray[0];
        if(str1.contains("+")){
            str1 = str1.substring(0,str1.indexOf("+"));
        }
        return str1.replace(".", "")+"@"+strArray[1];
    }
}
