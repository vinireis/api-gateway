package br.com.caelum.apigateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient("monolito")
public interface RestauranteRestClient {
	@PutMapping("/restaurantes/{id}")
	public RestauranteDto porId(@PathVariable("id") Long id);
}
