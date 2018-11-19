package usecases.base;

import reactor.core.publisher.Flux;

public interface IUseCase<R, P> {

    Flux<R> execute(P params);
}
