import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	public static void main(String[] args) {
		Robot bot = new Robot();
		bot.setSpeed(30);
		bot.miniaturize();
		bot.penDown();
		bot.move(70);
		bot.turn(180);
		bot.move(70);
		bot.turn(225);
		bot.move(90);
		bot.turn(90);
		bot.move(90);
		bot.turn(225);
		bot.move(70);
		
		
		
	}
	

}
