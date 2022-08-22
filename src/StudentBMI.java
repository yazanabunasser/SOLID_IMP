public class StudentBMI extends Student1
{
    public void setHeight(double h)
    {
        super.setHeight(h);
        super.setWeight(h);
    }

    @Override
    public void setWeight(double w) {
        super.setWeight(w);
        super.setHeight(w);
    }
}
