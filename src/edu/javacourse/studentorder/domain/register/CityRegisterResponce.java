package edu.javacourse.studentorder.domain.register;

public class CityRegisterResponce {
    private boolean existing;
    private Boolean temporal = null;

    public boolean isExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }

    public Boolean getTemporal() {
        return temporal;
    }

    public void setTemporal(Boolean temporal) {
        this.temporal = temporal;
    }

    @Override
    public String toString() {
        return "CityRegisterCheckerResponce{" +
                "existing=" + existing +
                ", temporal=" + temporal +
                '}';
    }
}
