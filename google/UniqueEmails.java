package google;


import java.util.HashSet;
import java.util.Set;

public class UniqueEmails {

	public static void main(String[] args) {
		
		String[] email = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com"};
		
		int count =  numUniqueEmails(email);
		
		System.out.println("count is =>" + count);
	}
		

	public static int numUniqueEmails(String[] emails) {

		Set<String> set = new HashSet();

		for (String email : emails) {

			StringBuilder newEmail = new StringBuilder();

			for (int i = 0; i < email.length(); i++) {

				if (email.charAt(i) == '+' || email.charAt(i) == '@')
					break;

				if (email.charAt(i) != '.') {
					newEmail.append(email.charAt(i));
				}
			}

			StringBuilder domainName = new StringBuilder();

			for (int i = email.length() - 1; i > 0; --i) {

				domainName.append(email.charAt(i));

				if (email.charAt(i) == '@') {
					break;
				}
			}

			domainName = domainName.reverse();

			newEmail.append(domainName);

			set.add(newEmail.toString());
		}
		return set.size();
	}

}
