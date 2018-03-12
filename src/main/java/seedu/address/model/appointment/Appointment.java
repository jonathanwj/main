package seedu.address.model.appointment;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Objects;

/**
 * Represents an Appointment in the application.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Appointment {

    private final Date date;
    private final Time time;
    private final String client; //dummy variable, class to be created
    private final String pet; //dummy variable, class to be created
    private final String vetTech; //dummy variable, class to be created

    /**
     * Every field must be present and not null.
     */
    public Appointment(Date date, Time time, String client, String pet, String vetTech) {
        requireAllNonNull(date, time, client, pet, vetTech);
        this.date = date;
        this.time = time;
        this.client = client;
        this.pet = pet;
        this.vetTech = vetTech;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public String getClient() {
        return client;
    }

    public String getPet() {
        return pet;
    }

    public String getVetTech() {
        return vetTech;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Appointment)) {
            return false;
        }

        Appointment otherAppointment = (Appointment) other;
        return otherAppointment.getDate().equals(this.getDate())
                && otherAppointment.getTime().equals(this.getTime())
                && otherAppointment.getClient().equals(this.getClient())
                && otherAppointment.getPet().equals(this.getPet())
                && otherAppointment.getVetTech().equals(this.getVetTech());
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(date, time, client, pet, vetTech);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getDate())
                .append(" Date: ")
                .append(getTime())
                .append(" Time: ")
                .append(getClient())
                .append(" Client: ")
                .append(getPet())
                .append(" Pet: ")
                .append(getVetTech())
                .append(" Vet Tech: ");
        return builder.toString();
    }

}