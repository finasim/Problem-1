package legder;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author finas
 *
 */
public class StudentsLedger {

	/**
	 * @param args
	 */
	static Student class8head = new Student();
	static Student class8tail = class8head;
	static Student class9head = new Student();
	static Student class9tail = class9head;
	static Student class10head = new Student();
	static Student class10tail = class10head;
	private static int totalEarnigsOfClass8;
	private static int totalEarnigsOfClass9;
	private static int totalEarnigsOfClass10;
	private static int totalEarnigs;
	private static int daysOfClass8;
	private static int daysOfClass9;
	private static int daysOfClass10;
	private static int totalDaysTaught;
	private static int earningsForMath;
	private static int earningsForEnglish;
	private static int earningsForBangla;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int option = 0;
		while(option!=6){
			System.out.println("Please Select an Option \n1. Add Student \n2. Edit Student \n3. Delete Student \n4. Individual Details \n5. Overall Info \n6. Exit ");
			System.out.print("Enter Option number: ");
			try {
				option=sc.nextInt();
				switch(option) {
				case 1:
					System.out.println("\n***Add Students***");
					addStudent();
					break;
				case 2:
					System.out.println("\n***Edit Student***");
					editStudent();
					break;
				case 3:
					System.out.println("\n***Delete Student***");
					deleteStudent();
					break;
				case 4:
					System.out.println("\n***Individual Details***");
					individualDetails();
					break;
				case 5:
					System.out.println("\n***(Overall Details***");
					overallDetails();
					break;
				case 6:
					break;
				default:
					System.out.println("No Option Found...!!!\n");
					break;
				}
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				System.out.println("Only Integer Numbers are acceptable...!!!");
				break;
			}
		}
		System.out.println("Thank You...");
		sc.close();

	}
	private static void overallDetails() {
		// TODO Auto-generated method stub
		System.out.println("Total days taught across all class: "+totalDaysTaught);
		System.out.println("Days taught in class 8: "+daysOfClass8);
		System.out.println("Days taught in class 9: "+daysOfClass9);
		System.out.println("Days taught in class 10: "+daysOfClass10);
		System.out.println("Total Earnings: "+totalEarnigs);
		System.out.println("Earnings from class 8: "+totalEarnigsOfClass8);
		System.out.println("Earnings from class 9: "+totalEarnigsOfClass9);
		System.out.println("Earnings from class 10: "+totalEarnigsOfClass10);
		System.out.println("Earnings from Math: "+earningsForMath);
		System.out.println("Earnings from English: "+earningsForEnglish);
		System.out.println("Earnings from Bangla: "+earningsForBangla);
		System.out.println("---------------------------------");
		System.out.println("|Name |\tAverage Marks |\tClass   |");
		System.out.println("---------------------------------");
		Student s=class8head.next;
		while(s!=null) {
			System.out.print(s.getName()+"\t"+s.getAvg()+"\t\tClass-8");
			System.out.println();
			System.out.println("---------------------------------");
			s=s.next;
		}
		s=class9head.next;
		while(s!=null) {
			System.out.print(s.getName()+"\t"+s.getAvg()+"\t\tClass-9");
			System.out.println();
			System.out.println("---------------------------------");
			s=s.next;
		}
		s=class10head.next;
		while(s!=null) {
			System.out.print(s.getName()+"\t"+s.getAvg()+"\t\tClass-10");
			System.out.println();
			System.out.println("---------------------------------");
			s=s.next;
		}
	}
	private static void individualDetails() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Select an Option \n1. Details of Class 8 \n2. Details of Class 9 \n3. Details of Class 10 \n4. Details of a Student \n5. Cancel");
		System.out.print("Enter Option number: ");
		try {
			int option = sc.nextInt();
			if(option==1) {
				Student s=class8head.next;
				System.out.println("-----------------------------------------------");
				System.out.println("|Name |\t Total Earnings |\t Average Marks|");
				System.out.println("-----------------------------------------------");
				while(s!=null) {
					System.out.println(s.getName()+"\t "+s.getTotalEarnings()+"\t\t\t "+s.getAvg());
					System.out.println("-----------------------------------------------");
					s=s.next;
				}
			}
			else if(option==2) {
				Student s=class9head.next;
				System.out.println("|Name |\t Total Earnings |\t Average Marks|");
				while(s!=null) {
					System.out.println(s.getName()+"\t\t "+s.getTotalEarnings()+"\t\t\t "+s.getAvg());
					System.out.println("-----------------------------------------------");
					s=s.next;
				}
			}
			else if(option==3) {
				Student s=class10head.next;
				System.out.println("|Name |\t Total Earnings |\t Average Marks|");
				while(s!=null) {
					System.out.println(s.getName()+"\t\t "+s.getTotalEarnings()+"\t\t\t "+s.getAvg());
					System.out.println("-----------------------------------------------");
					s=s.next;
				}
			}
			else if(option==4) {
				System.out.println("Please Select an Option \n1. Class 8 \n2. Class 9 \n3. Class 10 \n4.Cancel ");
				System.out.print("Enter Option number: ");
				int option2 = sc.nextInt();
				System.out.println("Enter Student's Name: ");
				sc.nextLine();
				String name=sc.nextLine();
				if(option2==1) {
					Student s=class8head.next;
					while(s!=null) {
						if(s.getName().equals(name)) {
							System.out.println("\nClass 8\nName: "+s.getName()+"\nTotal Days Taught: "+s.getNumberofDays()+"\nTotal Earnings: "+s.getTotalEarnings()+"\nAverage Marks: "+s.getAvg());
							System.out.print("Subjects: ");
							if(s.getMath()) {
								System.out.print("Math\t");
							}
							if(s.getEnglish()) {
								System.out.print("English\t");
							}
							if(s.getBangla()) {
								System.out.print("Bangla\t");
							}
							System.out.println();
							break;
						}
						s=s.next;
					}
				}
				else if(option2==2) {
					Student s=class9head.next;
					while(s!=null) {
						if(s.getName().equals(name)) {
							System.out.println("\nClass 9\nName: "+s.getName()+"\nTotal Days Taught: "+s.getNumberofDays()+"\nTotal Earnings: "+s.getTotalEarnings()+"\nAverage Marks: "+s.getAvg());
							System.out.print("Subjects: ");
							if(s.getMath()) {
								System.out.print("Math\t");
							}
							if(s.getEnglish()) {
								System.out.print("English\t");
							}
							if(s.getBangla()) {
								System.out.print("Bangla\t");
							}
							break;
						}
						s=s.next;
					}
				}
				else if(option2==3) {
					Student s=class10head.next;
					while(s!=null) {
						if(s.getName().equals(name)) {
							System.out.println("\nClass 10\nName: "+s.getName()+"\nTotal Days Taught: "+s.getNumberofDays()+"\nTotal Earnings: "+s.getTotalEarnings()+"\nAverage Marks: "+s.getAvg());
							System.out.print("Subjects: ");
							if(s.getMath()) {
								System.out.print("Math\t");
							}
							if(s.getEnglish()) {
								System.out.print("English\t");
							}
							if(s.getBangla()) {
								System.out.print("Bangla\t");
							}
							break;
						}
						s=s.next;
					}
				}
			}
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("Wrong Input!!!\n");
		}
		sc.close();
	}
	private static void deleteStudent() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Select an Option \n1. Class 8 \n2. Class 9 \n3. Class 10 \n4.Cancel ");
		System.out.print("Enter Option number: ");
		try {
			int option = sc.nextInt();
			if(option==4) {
				System.out.println("Operation Cancelled...!\n");
				sc.close();
				return;
			}
			System.out.println("Enter Student's Name: ");
			sc.nextLine();
			String name=sc.nextLine();
			if(option==1) {
				Student s=class8head.next;
				while(s!=null) {
					if(s.getName().equals(name)) {
						if (s.next!=null) {
							s.prev.next = s.next;
							s.next.prev = s.prev;
							System.out.println("Student " + s.getName() + " Deleted Successfully.\n");
							s = null;
							break;
						}
						else {
							s.prev.next=null;
							s.prev=null;
							System.out.println("Student " + s.getName() + " Deleted Successfully.\n");
							s=null;
							break;
						}
					}
					s=s.next;
				}
			}
			else if(option==2) {
				Student s=class9head.next;
				while(s!=null) {
					if(s.getName().equals(name)) {
						if (s.next!=null) {
							s.prev.next = s.next;
							s.next.prev = s.prev;
							System.out.println("Student " + s.getName() + " Deleted Successfully.\n");
							s = null;
							break;
						}
						else {
							s.prev.next=null;
							s.prev=null;
							System.out.println("Student " + s.getName() + "Deleted Successfully.\n");
							s=null;
							break;
						}
					}
					s=s.next;
				}
			}
			else if(option==3) {
				Student s=class10head.next;
				while(s!=null) {
					if(s.getName().equals(name)) {
						if (s.next!=null) {
							s.prev.next = s.next;
							s.next.prev = s.prev;
							System.out.println("Student " + s.getName() + "Deleted Successfully.\n");
							s = null;
							break;
						}
						else {
							s.prev.next=null;
							s.prev=null;
							System.out.println("Student " + s.getName() + "Deleted Successfully.\n");
							s=null;
							break;
						}
					}
					s=s.next;
				}
			}
			else{
				System.out.println("No Option found!!!");
			}
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("No Option Found!!!");
		}
		sc.close();
	}
	
	private static void editStudent() {
		// TODO Auto-generated method stub
		System.out.println("\nPlease Select an Option \n1. Add number of Days Taught \n2. Add Marks \n3.Cancel ");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Option number: ");
		try {
			int option = sc.nextInt();
			if(option==1) {
				System.out.println("\n***Adding number of Days Taught***");
				System.out.println("\nPlease Select an Option \n1. To all students \n2. To one Class \n3.To one Student \n4. Cancel");
				System.out.print("Enter Option number: ");
				int option2 = sc.nextInt();
				if(option2==1) {
					System.out.print("How many days: ");
					int days=sc.nextInt();
					addDaysToAllStudents(days);
				}
				else if(option2==2) {
					System.out.println("Please Select an Option \n1. Class 8 \n2. Class 9 \n3. Class 10 \n4.Cancel ");
					System.out.print("Enter Option number: ");
					int option3 = sc.nextInt();
					System.out.println("How many days: ");
					int days=sc.nextInt();
					if(option3==1) {
						addDaysToClass8(days);
					}
					else if(option3==2) {
						addDaysToClass9(days);
					}
					else if(option3==3) {
						addDaysToClass10(days);
					}
					else if(option3==4) {
						sc.close();
						return;
					}
					else {
						System.out.println("Wrong Option!!!");
					}
					
				}
				else if(option2==3) {
					addDaysToStudent();
				}
				else if(option2==4) {
				}
				else {
					System.out.println("Wrong Option!!!");
				}
			}
			else if(option==2) {
				System.out.println("\n***Adding Marks***");
				System.out.println("Please Select an Option \n1. Class 8 \n2. Class 9 \n3. Class 10 \n4.Cancel ");
				System.out.print("\nEnter Option number: ");
				int option2 = sc.nextInt();
				System.out.print("\nEnter Student's Name: ");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.print("\nEnter Marks: ");
				int marks=sc.nextInt();
				if (marks>=0&&marks<=100) {
					if (option2 == 1) {
						Student s = class8head.next;
						while (s != null) {
							if (s.getName().equals(name)) {
								s.addMarks(marks);
								break;
							}
							s = s.next;
						}
					} else if (option2 == 2) {
						Student s = class9head.next;
						while (s != null) {
							if (s.getName().equals(name)) {
								s.addMarks(marks);
								break;
							}
							s = s.next;
						}
					} else if (option2 == 3) {
						Student s = class10head.next;
						while (s != null) {
							if (s.getName().equals(name)) {
								s.addMarks(marks);
								break;
							}
							s = s.next;
						}
					} else if (option2 == 4) {
						System.out.println("Operation Cancelled!!!\n");
						return;
					} else {
						System.out.println("Wrong Option!!!");
					} 
				}
				else {
					System.out.println("Wrong Input!!!\n");
				}
			}
			else if(option==3) {
			}
			else {
				System.out.println("Wrong Option!!!");
			}
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("Wrong Input!!!");
		}
		sc.close();
	}
	private static void addDaysToStudent() {
		// TODO Auto-generated method stub
		System.out.println("Please Select an Option \n1. Class 8 \n2. Class 9 \n3. Class 10 \n4.Cancel ");
		System.out.print("Enter Option number: ");
		Scanner sc=new Scanner(System.in);
		try {
			int option = sc.nextInt();
			if(option==1) {
				System.out.print("\nEnter Student's Name: ");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.print("How many days: ");
				int days = sc.nextInt();
				daysOfClass8+=days;
				Student s=class8head.next;
				while(s!=null) {
					if(s.getName().equals(name)) {
						s.addDays(days);
						totalEarnigsOfClass8=totalEarnigsOfClass8+(days*s.getNumberOfSubjects());
						totalEarnigs=totalEarnigsOfClass8+totalEarnigsOfClass9+totalEarnigsOfClass10;
						updateSubjectEarnings(s,days);
						break;
					}
					s=s.next;
				}
			}
			else if(option==2) {
				System.out.print("\nEnter Student's Name: ");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.print("How many days: ");
				int days = sc.nextInt();
				daysOfClass9+=days;
				Student s=class9head.next;
				while(s!=null) {
					if(s.getName().equals(name)) {
						s.addDays(days);
						totalEarnigsOfClass9=totalEarnigsOfClass9+(days*s.getNumberOfSubjects());
						totalEarnigs=totalEarnigsOfClass8+totalEarnigsOfClass9+totalEarnigsOfClass10;
						updateSubjectEarnings(s,days);
						break;
					}
					s=s.next;
				}
			}
			else if(option==3) {
				System.out.print("\nEnter Student's Name: ");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.print("How many days: ");
				int days = sc.nextInt();
				daysOfClass10+=days;
				Student s=class10head.next;
				while(s!=null) {
					if(s.getName().equals(name)) {
						s.addDays(days);
						totalEarnigsOfClass10=totalEarnigsOfClass10+(days*s.getNumberOfSubjects());
						totalEarnigs=totalEarnigsOfClass8+totalEarnigsOfClass9+totalEarnigsOfClass10;
						updateSubjectEarnings(s,days);
						break;
					}
					s=s.next;
				}
			}
			else if(option==4) {
			}
			else {
				System.out.println("Wrong Option!!!");
			}
			totalDaysTaught=daysOfClass8+daysOfClass9+daysOfClass10;
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("Wrong Input!!!\n");
		}
		sc.close();
	}
	
	private static void updateSubjectEarnings(Student s, int days) {
		// TODO Auto-generated method stub
		if(s.getMath()) {
			earningsForMath+=days;
		}
		if(s.getEnglish()) {
			earningsForEnglish+=days;
		}
		if(s.getBangla()) {
			earningsForBangla+=days;
		}
		
	}
	private static void addDaysToClass10(int days) {
		// TODO Auto-generated method stub
		daysOfClass10+=days;
		totalDaysTaught=daysOfClass8+daysOfClass9+daysOfClass10;
		Student s=class10head.next;
		while(s!=null) {
			s.addDays(days);
			totalEarnigsOfClass10=totalEarnigsOfClass10+(days*s.getNumberOfSubjects());
			updateSubjectEarnings(s,days);
			s=s.next;
		}
		totalEarnigs=totalEarnigsOfClass8+totalEarnigsOfClass9+totalEarnigsOfClass10;
	}
	
	private static void addDaysToClass9(int days) {
		// TODO Auto-generated method stub
		daysOfClass9+=days;
		totalDaysTaught=daysOfClass8+daysOfClass9+daysOfClass10;
		Student s=class9head.next;
		while(s!=null) {
			s.addDays(days);
			totalEarnigsOfClass9=totalEarnigsOfClass9+(days*s.getNumberOfSubjects());
			updateSubjectEarnings(s,days);
			s=s.next;
		}
		totalEarnigs=totalEarnigsOfClass8+totalEarnigsOfClass9+totalEarnigsOfClass10;
		
	}
	
	private static void addDaysToClass8(int days) {
		// TODO Auto-generated method stub
		daysOfClass8+=days;
		totalDaysTaught=daysOfClass8+daysOfClass9+daysOfClass10;
		Student s=class8head.next;
		while(s!=null) {
			s.addDays(days);
			totalEarnigsOfClass8=totalEarnigsOfClass8+(days*s.getNumberOfSubjects());
			updateSubjectEarnings(s,days);
			s=s.next;
		}
		totalEarnigs=totalEarnigsOfClass8+totalEarnigsOfClass9+totalEarnigsOfClass10;
	}
	
	private static void addDaysToAllStudents(int days) {
		// TODO Auto-generated method stub
		daysOfClass8+=days;
		daysOfClass9+=days;
		daysOfClass10+=days;
		totalDaysTaught=daysOfClass8+daysOfClass9+daysOfClass10;
		Student s=class8head.next;
		while(s!=null) {
			s.addDays(days);
			totalEarnigsOfClass8=totalEarnigsOfClass8+(days*s.getNumberOfSubjects());
			updateSubjectEarnings(s,days);
			s=s.next;
		}
		s=class9head.next;
		while(s!=null) {
			s.addDays(days);
			totalEarnigsOfClass9=totalEarnigsOfClass9+(days*s.getNumberOfSubjects());
			updateSubjectEarnings(s,days);
			s=s.next;
		}
		s=class10head.next;
		while(s!=null) {
			s.addDays(days);
			totalEarnigsOfClass10=totalEarnigsOfClass10+(days*s.getNumberOfSubjects());
			updateSubjectEarnings(s,days);
			s=s.next;
		}
		totalEarnigs=totalEarnigsOfClass8+totalEarnigsOfClass9+totalEarnigsOfClass10;
	}
	
	private static void addStudent() {
		// TODO Auto-generated method stub
		System.out.println("Please Select an Option \n1. Class 8 \n2. Class 9 \n3. Class 10 \n4.Cancel ");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Option number: ");
		try {
			int option = sc.nextInt();
			if(option==1) {
				System.out.println("Adding Student in Class 8");
				System.out.print("Enter Name: ");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.println("Please write true or false beside subject");
				System.out.print("Math: ");
				boolean math=sc.nextBoolean();
				System.out.print("English: ");
				boolean english=sc.nextBoolean();
				System.out.print("Bangla: ");
				boolean bangla=sc.nextBoolean();
				Student student=new Student(name,math,english,bangla);
				class8tail.next=student;
				student.prev=class8tail;
				class8tail=student;
			}
			else if(option==2) {
				System.out.println("Adding Student in Class 9");
				System.out.print(" Enter Name: ");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.println("Please write true or false beside subject");
				System.out.print("Math: ");
				boolean math=sc.nextBoolean();
				System.out.print("English: ");
				boolean english=sc.nextBoolean();
				System.out.print("Bangla: ");
				boolean bangla=sc.nextBoolean();
				Student student=new Student(name,math,english,bangla);
				class9tail.next=student;
				student.prev=class9tail;
				class9tail=student;
			}
			else if(option==3) {
				System.out.println("Adding Student in Class 10");
				System.out.print("Name: ");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.println("Please write true or false beside subject");
				System.out.print("Math: ");
				boolean math=sc.nextBoolean();
				System.out.print("English: ");
				boolean english=sc.nextBoolean();
				System.out.print("Bangla: ");
				boolean bangla=sc.nextBoolean();
				Student student=new Student(name,math,english,bangla);
				class10tail.next=student;
				student.prev=class10tail;
				class10tail=student;
			}
			else if(option==4) {
				System.out.println("Operation Cancelled");
				sc.close();
				return;
			}
			else {
				System.out.println("Wrong Option!!!");
			}
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("Wrong Input!!!\n");
		}
		sc.close();
	}

}
