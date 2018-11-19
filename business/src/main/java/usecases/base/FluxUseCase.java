package usecases.base;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

@Service
public abstract class FluxUseCase<R, P> implements IUseCase<R, P> {
    @Override
    public Flux<R> execute(P params) {
        return buildUseCase(params)
                .subscribeOn(Schedulers.elastic())
                .publishOn(Schedulers.single());
    }

    protected abstract Flux<R> buildUseCase(P params);
}
