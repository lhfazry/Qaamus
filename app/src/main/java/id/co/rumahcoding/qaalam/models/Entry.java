package id.co.rumahcoding.qaalam.models;

import io.realm.RealmObject;

/**
 * Created by blastocode on 5/27/17.
 */

public class Entry extends RealmObject {
    private long id;
    private String text;
    private String tarjim;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTarjim() {
        return tarjim;
    }

    public void setTarjim(String tarjim) {
        this.tarjim = tarjim;
    }
}
