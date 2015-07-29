package student;

	public class GradeCalc
	{
		public static void main(String[]args)
		{
			double totalPoints=0;
			int score=0;
			double gpa=0.0;
			double percent = calcPercent(totalPoints, score);
			String grade=calcGrade(percent);
			String classType="";
			gpa=calcGpa(grade, classType);
		}
		public static double calcPercent(double totalPoints, int score)
		{
			double percent=0.0;
			percent=(score/totalPoints)*100;
			return percent;
		}
		public static String calcGrade(double percent)
		{
			String grade;
			if(percent>=93&&percent<=100)
			{
				grade="A";
				return grade;
			}
			else if(percent<93&&percent>=90)
			{
				grade="A-";
				return grade;
			}
			else if(percent<90&&percent>=87)
			{
				grade="B+";
				return grade;
			}
			else if(percent<87&&percent>=83)
			{
				grade="B";
				return grade;
			}
			else if(percent<83&&percent>=80)
			{
				grade="B-";
				return grade;
			}
			else if(percent<80&&percent>=77)
			{
				grade="C+";
				return grade;
			}
			else if(percent<77&&percent>=73)
			{
				grade="C";
				return grade;
			}
			else if(percent<73&&percent>=70)
			{
				grade="C-";
				return grade;
			}
			else if(percent<70&&percent>=67)
			{
				grade="D+";
				return grade;
			}
			else if(percent<67&&percent>=64)
			{
				grade="D";
				return grade;
			}
			else
			{
				grade="F";
				return grade;
			}
		}
		public static double calcGpa(String grade, String classType)
		{
			double gpa;
			if(classType.equalsIgnoreCase("AP"))
			{
				if(grade.equals("A"))
				{
					gpa=5.0;
					return gpa;
				}
				else if(grade.equals("A-"))
				{
					gpa=4.7;
					return gpa;
				}
				else if(grade.equals("B+"))
				{
					gpa=4.3;
					return gpa;
				}
				else if(grade.equals("B"))
				{
					gpa=4.0;
					return gpa;
				}	
				else if(grade.equals("B-"))
				{
					gpa=3.7;
					return gpa;
				}
				else if(grade.equals("C+"))
				{
					gpa=3.3;
					return gpa;
				}
				else if(grade.equals("C"))
				{
					gpa=3.0;
					return gpa;
				}
				else if(grade.equals("C-"))
				{
					gpa=2.7;
					return gpa;
				}
				else if(grade.equals("D+"))
				{
					gpa=2.3;
					return gpa;
				}
				else if(grade.equals("D"))
				{
					gpa=2.0;
					return gpa;
				}	
				else
				{
					gpa=0.0;
					return gpa;
				}	
			}
			else if(classType.equalsIgnoreCase("Honors"))
			{
				if(grade.equals("A"))
				{
					gpa=4.5;
					return gpa;
				}
				else if(grade.equals("A-"))
				{
					gpa=4.2;
					return gpa;
				}
				else if(grade.equals("B+"))
				{
					gpa=3.8;
					return gpa;
				}
				else if(grade.equals("B"))
				{
					gpa=3.5;
					return gpa;
				}
				else if(grade.equals("B-"))
				{
					gpa=3.2;
					return gpa;
				}
				else if(grade.equals("C+"))
				{
					gpa=2.8;
					return gpa;
				}	
				else if(grade.equals("C"))
				{
					gpa=2.5;
					return gpa;
				}
				else if(grade.equals("C-"))
				{
					gpa=2.2;
					return gpa;
				}
				else if(grade.equals("D+"))
				{
					gpa=1.8;
					return gpa;
				}
				else if(grade.equals("D"))
				{
					gpa=1.5;
					return gpa;
				}
				else 
				{
					gpa=0.0;
					return gpa;
				}
			}
			else 
			{
				if(grade.equals("A"))
				{
					gpa=4.0;
					return gpa;
				}	
				else if(grade.equals("A-"))
				{
					gpa=3.7;
					return gpa;
				}
				else if(grade.equals("B+"))
				{
					gpa=3.3;
					return gpa;
				}
				else if(grade.equals("B"))
				{
					gpa=3.0;
					return gpa;
				}
				else if(grade.equals("B-"))
				{
					gpa=2.7;
					return gpa;
				}	
				else if(grade.equals("C+"))
				{
					gpa=2.3;
					return gpa;
				}	
				else if(grade.equals("C"))
				{
					gpa=2.0;
					return gpa;
				}
				else if(grade.equals("C-"))
				{
					gpa=1.7;
					return gpa;
				}	
				else if(grade.equals("D+"))
				{
					gpa=1.3;
					return gpa;
				}
				else if(grade.equals("D"))
				{
					gpa=1.0;
					return gpa;
				}
				else 
				{
					gpa=0.0;
					return gpa;
				}
			}
		}
	}

