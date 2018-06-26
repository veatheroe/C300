package oe.stu.april;

import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * @Author： oe
 * @Description:
 * @Created by oe on 2018/4/25.
 */
public class matlabFileReader {
    static File matlabfile = new File("F:\\研究生文件\\代码\\BASBenchmarks-master\\src\\matlab.txt");
    public static void main(String[] args) throws Exception{
        String fileString = FileUtils.readFileToString(matlabfile);
        String[] lines = fileString.split("\n");
        String toXML = "";
        String defineString = "";
        String startValue = "";
        int i= 4;
        for(String line : lines){
            if(line.contains("Boiler") && line.substring(0,6).equals("Boiler")){
                defineString += "#define " + line.substring(line.indexOf(".")+1,line.indexOf(" ")) + "       "+i+ "\n";
                startValue += "r("+line.substring(line.indexOf(".")+1,line.indexOf(" "))+") = "+line.substring(line.indexOf("=")+2,line.indexOf(";"))+";\n";
                toXML += "<ScalarVariable name= \""+line.substring(line.indexOf(".")+1,line.indexOf(" "))+"\" "+
                        "valueReference=\"" +i+ "\" " +
                        "description=\"" +(line.contains("%") ? line.substring(line.indexOf("%")+2,line.length()-1) : "") + "\" " +
                        " \n \t" +
                        "causality=\"" +"none"+ "\" " +
                        "variablity=\"" +"fixed"+ "\" " +
                        "initial=\"" +"exact"+ "\"> " +
                        " \n \t" +
                        "<Real start= \""+line.substring(line.indexOf("=")+2,line.indexOf(";"))+"\"/>"+
                        " \n </ScalarVariable>\n";
                i++;
            }else
                continue;

        }
        System.out.println(toXML);
        System.out.println(defineString);
        System.out.println(startValue);
    }


}
