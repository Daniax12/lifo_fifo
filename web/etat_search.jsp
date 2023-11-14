     <div class="col-lg-8" style="margin-right: auto; margin-left: auto;">
    <div class="card" >
        <div class="card-header"> Etat de stock </div>
        <div class="card-body">
            <div class="card-title">
                <h3 class="text-center title-2"> Voir etat de stock entre 2 dates </h3>
            </div>
            <hr>
            <form action="" method="post" novalidate="novalidate">
                <div class="form-group" style="margin-bottom: 3%;">
                    <label for="cc-payment" class="control-label mb-1"> Date debut </label>
                    <div class="col-lg-12 col-md-9">
                        <input type="date" id="disabled-input" name="date_mouvement" class="form-control">
                    </div>
                </div>
                <div class="form-group" style="margin-bottom: 3%;">
                    <label for="cc-payment" class="control-label mb-1"> Date fin </label>
                    <div class="col-lg-12 col-md-9">
                        <input type="date" id="disabled-input" name="date_mouvement" class="form-control">
                    </div>
                </div>
                <div class="form-group has-success">
                    <label for="cc-name" class="control-label mb-1"> Produits </label>
                    <div class="col-lg-12 col-md-9">
                        <select name="prouduit" id="select" class="form-control">
                            <option value="0">Tous produits</option>
                            <option value="1">Oignon</option>
                            <option value="2">Tomate</option>
                            <option value="3">Riz</option>
                        </select>
                    </div>
                </div>
                <div class="form-group" style="margin-bottom: 3%;">
                    <label for="cc-number" class="control-label mb-1"> Magasin </label>
                    <div class="col-lg-12 col-md-9">
                        <select name="frn" id="select" class="form-control">
                            <option value="0"> Tous magasins </option>
                            <option value="1"> Magasin M1 </option>
                            <option value="2">Magasin M2</option>
                        </select>
                    </div>
                </div>
                <div>
                    <button id="payment-button" type="submit" class="btn btn-lg btn-info btn-block">
                        <span id="payment-button-amount"> Show </span>
                        <span id="payment-button-sending" style="display:none;">Sending?</span>
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>