package usecases.base;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public abstract class ObservableUseCase<R, P> implements IUseCase<R, P> {

    protected abstract Observable<R> buildUseCase(P params);

    @Override
    public Observable<R> execute(P params) {
        return buildUseCase(params)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.single());
    }
}
