package week3.day2.assignments;



	public abstract class Desktop implements Hardware, Software {

		public void desktopModel() {
			System.out.println("Desktop Model ");
		}

		
		@Override
		public void hardwareComponents() {
			System.out.println("Hardware Resources :");
			System.out.println("Monitor");
			System.out.println("Keyboard");
		}


		@Override
		public void softwareComponents() {
			System.out.println("Software Resources :");
			System.out.println("Browser");
			System.out.println("MS Office");
		}


	}