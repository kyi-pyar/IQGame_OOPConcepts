package IQ_Game;



public class Age_Game implements GameControl{
	
	int age;
	int dif_age;
	int cor_ans;
	String question;
	
	public Age_Game(){
		age=Constant.random.nextInt(100);		
		do{
		dif_age=Constant.random.nextInt(Constant.INITIAL_NUM_RANGE)+1;
		}while(dif_age%2!=0);		
		this.cor_ans=age+(dif_age/2);
	}	
	
	//east- EasT

	public int getCor_ans() {
		return cor_ans;
	}



	@Override
	public String generateQuestion() {
		question="I am "+age+" years old now. My age is half of my bro age when  he was "+dif_age+". How old is he now?";
		return question;
	}

	@Override
	public void diplayQuestion() {
		System.out.println(generateQuestion());		
	}

	@Override
	public boolean check_ans() {
		// TODO Auto-generated method stub //20
		return false;
	}
	
	

	

}
