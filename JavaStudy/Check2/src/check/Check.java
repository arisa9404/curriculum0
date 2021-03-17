package check;

import constants.Constants;

public class Check {
	private String firstName = "藤田";
	private String lastName = "愛璃彩";

	private void printName() {
		System.out.println("printNameメソッド　→　" + firstName + lastName);
	}

	public static void main(String[] args) {
		Check c = new Check();
		c.printName();

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet rpet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		rpet.introduce();

	}

}
