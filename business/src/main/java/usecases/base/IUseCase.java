package usecases.base;

import io.reactivex.Observable;

import java.io.IOException;

public interface IUseCase<R, P> {

    Observable<R> execute(P params);
}
