public class CarRental {

    private LocalDatetime start;
    private LocalDatetime finish;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(LocalDatetime start, LocalDatetime finish, Vehicle vehicle, Invoice invoice) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
        this.invoice = invoice;
    }

    public LocalDatetime getStart() {
        return start;
    }

    public void setStart(LocalDatetime start) {
        this.start = start;
    }

    public LocalDatetime getFinish() {
        return finish;
    }

    public void setFinish(LocalDatetime finish) {
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
