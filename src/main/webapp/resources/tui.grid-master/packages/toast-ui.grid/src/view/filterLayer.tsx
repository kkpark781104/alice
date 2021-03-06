import { h, Component } from 'preact';
import { connect } from './hoc';
import { DispatchProps } from '../dispatch/create';
import { ActiveColumnAddress, Filter } from '../store/types';
import { FilterLayerInner } from './filterLayerInner';

interface StoreProps {
  activeColumnAddress: ActiveColumnAddress | null;
  activeFilterState: Filter | null;
}

type Props = StoreProps & DispatchProps;

export class FilterLayerComp extends Component<Props> {
  public render({ activeColumnAddress, activeFilterState }: Props) {
    return (
      activeColumnAddress &&
      activeFilterState && (
        <FilterLayerInner columnAddress={activeColumnAddress} filterState={activeFilterState} />
      )
    );
  }
}

export const FilterLayer = connect<StoreProps>(({ filterLayerState }) => {
  const { activeColumnAddress, activeFilterState } = filterLayerState;
  return { activeColumnAddress, activeFilterState };
})(FilterLayerComp);
