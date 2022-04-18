public class SecurityGuard extends Person implements OfficeSupportEntity {

    private Office office;

    public SecurityGuard(Long id, String name, Computer computer, Office office) {
        super(id, name, computer);
        this.office = office;
    }

    @Override
    public Office getOffice() {
        return office;
    }

    @Override
    public void setOffice(Office office) {
        this.office = office;
    }

}
