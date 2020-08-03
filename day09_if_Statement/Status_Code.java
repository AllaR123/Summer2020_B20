package day09_if_Statement;

import java.util.Scanner;

public class Status_Code {

        /*
        HTTP is the protocol that governs communications between webservers and web clients (i.e. browsers).
        Part of the protocol includes a status code returned by the server to tell the browser
        the status of its most recent page request. Some of the codes and their meanings are listed below:
        status code:

        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable

    1. declare an int variable called StatusCode
    2. write a if statement that prints out, on a line by itself,
    the appropriate label from the above list based on status.
                    Example:
                        if status code = 200
                        output: ok
                        if status code = 201:
                        output: Created
            NOTE: use single if statements ONLY. DO NOT use more that one print statement
         */


        /*

        int statusCode = 403;
        String status = "";

        if(statusCode == 200) {
            status = "OK";
        } if(statusCode == 201) {
            status = "Created";
        } if(statusCode == 202) {
            status = "Accepted";
        } if(statusCode == 301) {
            status = "Moved Permanently";
        } if(statusCode == 303) {
            status = "See Other";
        } if (statusCode == 304) {
            status = "Not Modified";
        } if(statusCode == 307) {
            status = "Temporary Redirect";
        } if(statusCode == 400) {
            status = "Bad Request";
        } if(statusCode == 401) {
            status = "Unauthorized";
        } if(statusCode == 403) {
            status = "Forbidden";
        } if(statusCode == 404) {
            status = "Not Found";
        } if(statusCode == 500) {
            status = "Internal Server Error";
        } if(statusCode == 503) {
            status = "Service Unavailable";
        }
        System.out.println(status);

        */

        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = 1;
        String error1 = "Please, type 3 digits valid HTTP protocol!";

        while (number != 0){
            System.out.println("Please, type the 3 digits of your HTTP protocol: ");
            System.out.println("Press 0 to exit the program");
            int code = in.nextInt();
            in.nextLine();

                switch (code) {
                    case 200 :
                    System.out.println("Code " + code + " , OK");
                    break;
                    case 201 :
                    System.out.println("Code " + code + " , Created");
                    break;
                    case 202 :
                    System.out.println("Code " + code + " , Accepted");
                    break;
                    case 301 :
                    System.out.println("Code " + code + " , Moved Permanently");
                    break;
                    case 303 :
                    System.out.println("Code " + code + " , See Other");
                    break;
                    case 304 :
                    System.out.println("Code " + code + " , Not Modified");
                    break;
                    case 307 :
                    System.out.println("Code " + code + " , Temporary Redirect");
                    break;
                    case 400 :
                    System.out.println("Code " + code + " , Bad Request");
                    break;
                    case 401 :
                    System.out.println("Code " + code + " , Unauthorized");
                    break;
                    case 403 :
                    System.out.println("Code " + code + " , Forbidden");
                    break;
                    case 404 :
                    System.out.println("Code " + code + " , Not Found");
                    break;
                    case 410 :
                    System.out.println("Code " + code + " , Gone");
                    break;
                    case 500 :
                    System.out.println("Code " + code + " , Internal Server Error");
                    break;
                    case 503 :
                    System.out.println("Code " + code + " , Service Unavailable");
                    break;
                    case 0 :
                        number = 0;
                        System.out.println("Good bye");
                        break;
                    default:
                    System.out.println(error1);

                    break;
                }
        }


    }
}



