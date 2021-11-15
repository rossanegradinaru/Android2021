package ro.ase.eatandtrack;

import java.util.List;

public interface IResponse {
    public void onSuccess(List<Specialist> list);
    public void onError(String errorMessage);
}
