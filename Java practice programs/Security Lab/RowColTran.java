public class RowColTran {
    public static void main(String[] args) {
        String pl="Security Lab";
        String s="";
        int i,j,start=0;
        for(i=0;i<pl.length();i++)
        {
            if(pl.charAt(i)==' ')
            {
                s+=pl.substring(start, i);
                start=i+1;
            }
        }    
        s+=pl.substring(start,i);
        int row,col,k=0,l;
        col=4;
        row=3;
        l=s.length();
        char [][]ch=new char[row][col];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                if(k<l)
                    ch[i][j]=s.charAt(k++);
                else
                    ch[i][j]='#';
            }
        }
        for(i=0;i<col;i++)
        {
            for(j=0;j<row;j++)
                System.out.print(ch[j][i]);
        }
    }
}
