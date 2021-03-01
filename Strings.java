public class Strings {
    public static void main(String[] args) {
        String ln="jdbjkdn//wjkvbjwbvn\\ldjvbkdjvb";
        System.out.println(slashInverter(ln));
    }


    public static String spaceAdder(String line) {
        char[] lineInChars = line.toCharArray();
        String newLine="";
        for (int i=0; (i< ((lineInChars.length)-1)); i++) {
           newLine+=lineInChars[i];
           if ((lineInChars[i]=='.') || (lineInChars[i]==',') || (lineInChars[i]==':') || (lineInChars[i]=='!') || (lineInChars[i]=='?')) {
               if   (lineInChars[i+1]!=' ') {
               newLine+=' ';
           }
        }
        }
        newLine+=lineInChars[lineInChars.length-1];

           if ((lineInChars[lineInChars.length-1]=='.') || (lineInChars[lineInChars.length-1]==',') || (lineInChars[lineInChars.length-1]==':') || (lineInChars[lineInChars.length-1]=='!') || (lineInChars[lineInChars.length-1]=='?')) {
                newLine+=' ';
            }
        return newLine;
    }

    public static String slashInverter(String line) {
        char[] lineInChars = line.toCharArray();
        String newLine="";
        for (int i=0; i<lineInChars.length; i++) {
            if (lineInChars[i]!='/') {
                newLine+=lineInChars[i];
            }
            else {
                newLine+='\\';
            }
        }
        return newLine;
    }

    public static boolean invalidChars (String line) {
        char[] lineInChars = line.toCharArray();

    }

}
