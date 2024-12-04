package exceptionss;

public class CustomException {

	public static void main(String[] args) throws VotingException {

			int age=10;
			if(age>18)
			
				System.out.println("eligible for voting");
				else
					throw new VotingException("Entet the value greater than 18");
			
	}

}
