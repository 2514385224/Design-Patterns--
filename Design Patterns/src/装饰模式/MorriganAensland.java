package װ��ģʽ;


import java.awt.*;
import javax.swing.*;
public class MorriganAensland
{
    public static void main(String[] args)
    {
        Morrigan m0=new original();
        m0.display();
        Morrigan m1=new Succubus(m0);
        m1.display();
        Morrigan m2=new Girl(m0);
        m2.display();
    }
}
//���󹹼���ɫ��Ī��
interface  Morrigan
{
    public void display();
}
//���幹����ɫ��ԭ��
class original extends JFrame implements Morrigan
{
    private static final long serialVersionUID = 1L;
    private String t="Morrigan0.jpg";
    public original()
    {
        super("����ħսʿ���е�Ī�򿨡���˹��");                
    }
    public void setImage(String t)
    {
        this.t=t;           
    }
    public void display()
    {   
        this.setLayout(new FlowLayout());
        JLabel l1=new JLabel(new ImageIcon("src/decorator/"+t));
        this.add(l1);   
        this.pack();       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setVisible(true);
    }
}
//����װ�ν�ɫ������
class Changer implements Morrigan
{
    Morrigan m;   
    public Changer(Morrigan m)
    {
        this.m=m;
    }   
    public void display()
    {
        m.display();
    }
}
//����װ�ν�ɫ��Ů��
class Succubus extends Changer
{
    public Succubus(Morrigan m)
    {
        super(m);
    }   
    public void display()
    {
        setChanger();
        super.display();   
    }
    public void setChanger()
    {
        ((original) super.m).setImage("Morrigan1.jpg");           
    }
}
//����װ�ν�ɫ����Ů
class Girl extends Changer
{
    public Girl(Morrigan m)
    {
        super(m);
    }   
    public void display()
    {
        setChanger();
        super.display();   
    }
    public void setChanger()
    {
        ((original) super.m).setImage("Morrigan2.jpg");           
    }
}