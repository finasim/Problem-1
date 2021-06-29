package legder;

public class Student {
	Student next;
	Student prev;
	private String name;
	private boolean math;
	private boolean english;
	private boolean bangla;
	private int numberOfSubjects=0;
	private int totalMarks=0;
	private int numberOfExams=0;
	private double avg=0;
	private int numberOfDays=0;	
	private int totalEarnings=0;
	public Student(String name, boolean math, boolean english, boolean bangla){
		this.name=name;
		this.math=math;
		this.english=english;
		this.bangla=bangla;
		countSubjects();
		System.out.println("Student's Informations: ");
		System.out.println("Name: "+name+"\nMath: "+math+"\nEnglish: "+english+"\nBangla: "+bangla);
		System.out.println("Total "+numberOfSubjects+" Subject(s)");
		System.out.println("\n***Created Successfully***\n");
	}
	public Student() {
		
	}
	private void countSubjects() {
		// TODO Auto-generated method stub
		if(math) {
			numberOfSubjects++;
		}
		if(english) {
			numberOfSubjects++;
		}
		if(bangla) {
			numberOfSubjects++;
		}
	}
	public void addDays(int days) {
		numberOfDays+=days;
		System.out.println("Added "+days+" with total number of days.");
		calculateEarnings(numberOfDays);
	}
	private void calculateEarnings(int numberOfDays) {
		// TODO Auto-generated method stub
		totalEarnings=numberOfDays*numberOfSubjects;
		System.out.println("Earnings Updated");
	}
	public void addMarks(int marks) {
		totalMarks+=marks;
		System.out.println("Added "+marks+" with total Marks");
		numberOfExams++;
		updateAvg();
	}
	private void updateAvg() {
		// TODO Auto-generated method stub
		avg=(double)(totalMarks)/(double)(numberOfExams);
		System.out.println("Average marks updated "+avg);
	}
	public int getNumberOfSubjects() {
		// TODO Auto-generated method stub
		return this.numberOfSubjects;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	public int getTotalEarnings() {
		// TODO Auto-generated method stub
		return this.totalEarnings;
	}
	public double getAvg() {
		// TODO Auto-generated method stub
		return this.avg;
	}
	public int getNumberofDays() {
		// TODO Auto-generated method stub
		return numberOfDays;
	}
	public boolean getMath() {
		// TODO Auto-generated method stub
		return this.math;
	}
	public boolean getEnglish() {
		// TODO Auto-generated method stub
		return this.english;
	}
	public boolean getBangla() {
		// TODO Auto-generated method stub
		return this.bangla;
	}
}
