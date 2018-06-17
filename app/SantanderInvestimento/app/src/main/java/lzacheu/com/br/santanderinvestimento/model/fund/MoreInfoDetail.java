package lzacheu.com.br.santanderinvestimento.model.fund;

import com.google.gson.annotations.SerializedName;

/**
 * Created by luiszacheu on 6/16/18.
 */

public class MoreInfoDetail {

    private double fund;

    @SerializedName("CDI")
    private double cdi;

    public double getFund() {
        return fund;
    }

    public void setFund(double fund) {
        this.fund = fund;
    }

    @Override
    public String toString() {
        return "MoreInfoDetail{" +
                "fund=" + fund +
                ", cdi=" + cdi +
                '}';
    }
}
