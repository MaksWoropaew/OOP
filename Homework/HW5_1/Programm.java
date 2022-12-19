package Homework.HW5_1;

import Homework.HW5_1.Controllers.UserController;
import Homework.HW5_1.Model.Calc;
import Homework.HW5_1.Model.CalcImpl;
import Homework.HW5_1.Model.LogManager;
import Homework.HW5_1.Views.ViewCalc;

public class Program {
    public static void main(String[] args) {
        Calc calc = new CalcImpl();
        UserController userController = new UserController(calc);
        LogManager logManager = new LogManager("Homework5/Log.log");
        ViewCalc viewCalc = new ViewCalc(userController, logManager);
        viewCalc.run();
    }
}