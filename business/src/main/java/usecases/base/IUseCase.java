package usecases.base;

import io.reactivex.Observable;

public interface IUseCase<R, P> {

    Observable<R> execute(P params);
}
