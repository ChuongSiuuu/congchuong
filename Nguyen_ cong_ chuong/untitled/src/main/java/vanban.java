import java.util.StringTokenizer;

public  class vanban {
    private String st;

    public vanban() {
    }

    public vanban(String st) {
        this.st = st;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }
    public int sokytu ()
    {
        StringTokenizer stringTokenizer = new StringTokenizer(st);
        int soTuTrongChuoi = stringTokenizer.countTokens();
        return soTuTrongChuoi;
    }
    StringBuffer stb;

    public String chuanhoaxau ()
    {
        st =st.trim().toUpperCase();
        stb=new StringBuffer(st);
        int i=0;
        while(i<stb.length()-1) {
            if(stb.charAt(i)==' '&& stb.charAt(i+1)==' ') stb.delete(i, i+1);
            else i++;
        }
        return  st;
    }
    public String viethoa ()
    {
        st=st.toUpperCase();
        return st;
    }
    public String chuthuong()
    {
        char[] charArray = st.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] >= 65 && charArray[i] <= 90){
                charArray[i] += 32;
            }
        }
        st = String.valueOf(charArray);
        return st;
    }
    public String viethoachudau()
    {
        String[] arr = st.split(" ");
        String stringfromclient1 = "";
        for (String x : arr) {
            stringfromclient1 = stringfromclient1 + (x.substring(0, 1).toUpperCase() + x.substring(1));
            stringfromclient1 = stringfromclient1 + " ";
        }
        return stringfromclient1;
    }

    @Override
    public String toString() {
        return "vanban [" + "st='" + st + '\'' +
                 "\n so ky tu trong van ban la "+ sokytu() +
                "\n van ban sau khi chuan hoa la \n " + chuanhoaxau() +
                "\n van ban in hoa : " + viethoa() +
                "\n van ban in thuong la : " + chuthuong() +
                 "\n viet hoa chu cai dau tien  : " + viethoachudau();
    }
}
